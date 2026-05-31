-- Add a customer_email column to support customer notifications on
-- order events. Nullable to keep V1 rows valid without backfill;
-- application logic enforces presence on new orders.
ALTER TABLE orders
    ADD COLUMN customer_email VARCHAR(320);

CREATE INDEX idx_orders_customer_email ON orders(customer_email);
