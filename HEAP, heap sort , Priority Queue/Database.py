import sqlite3
import pandas as pd

# Database and file paths
DATABASE_PATH = "walmart.db"
SPREADSHEET_0 = "spreadsheet_0.csv"
SPREADSHEET_1 = "spreadsheet_1.csv"
SPREADSHEET_2 = "spreadsheet_2.csv"

# Connect to SQLite database
conn = sqlite3.connect(DATABASE_PATH)
cursor = conn.cursor()

# Create tables if they don't exist
def create_tables():
    cursor.execute("""
        CREATE TABLE IF NOT EXISTS products (
            id INTEGER PRIMARY KEY AUTOINCREMENT,
            product_name TEXT NOT NULL,
            manufacturer TEXT NOT NULL,
            weight REAL,
            flavor TEXT,
            target_health_condition TEXT
        )
    """)
    cursor.execute("""
        CREATE TABLE IF NOT EXISTS shipments (
            shipment_id TEXT PRIMARY KEY,
            origin TEXT NOT NULL,
            destination TEXT NOT NULL,
            shipment_date TEXT NOT NULL
        )
    """)
    cursor.execute("""
        CREATE TABLE IF NOT EXISTS shipment_products (
            id INTEGER PRIMARY KEY AUTOINCREMENT,
            shipment_id TEXT NOT NULL,
            product_name TEXT NOT NULL,
            quantity INTEGER NOT NULL,
            FOREIGN KEY (shipment_id) REFERENCES shipments(shipment_id)
        )
    """)
    conn.commit()

# Function to insert data into a table
def insert_data(table_name, data):
    if not data:
        return
    placeholders = ', '.join('?' * len(data[0]))
    query = f"INSERT INTO {table_name} VALUES (NULL, {placeholders})" if table_name != "shipments" else f"INSERT INTO {table_name} VALUES ({placeholders})"
    cursor.executemany(query, data)
    conn.commit()

# Step 1: Process Spreadsheet 0
def process_spreadsheet_0():
    df = pd.read_csv(SPREADSHEET_0)
    data = df.to_records(index=False)
    formatted_data = [tuple(row) for row in data]
    insert_data("products", formatted_data)

# Step 2: Process Spreadsheets 1 and 2
def process_spreadsheets_1_and_2():
    # Read the spreadsheets
    df1 = pd.read_csv(SPREADSHEET_1)
    df2 = pd.read_csv(SPREADSHEET_2)

    # Merge spreadsheets 1 and 2 on 'shipping_identifier'
    merged_df = df1.merge(df2, on="shipping_identifier")

    # Extract and prepare data
    shipment_data = []
    shipment_products_data = []
    for _, row in merged_df.iterrows():
        shipment_id = row["shipping_identifier"]
        origin = row["origin"]
        destination = row["destination"]
        shipment_date = row["shipment_date"]
        product = row["product_name"]
        quantity = row["quantity"]

        # Prepare shipment data (unique by shipping_identifier)
        if not any(shipment_id == shipment[0] for shipment in shipment_data):
            shipment_data.append((shipment_id, origin, destination, shipment_date))

        # Prepare shipment products data
        shipment_products_data.append((shipment_id, product, quantity))

    # Insert data into the database
    insert_data("shipments", shipment_data)
    insert_data("shipment_products", shipment_products_data)

# Main function to process all spreadsheets
def main():
    create_tables()
    process_spreadsheet_0()
    process_spreadsheets_1_and_2()
    print("Data successfully inserted into the database!")

if __name__ == "__main__":
    main()
