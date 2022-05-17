CREATE TABLE users (
    id SERIAL PRIMARY KEY,
    username VARCHAR NOT NULL,
    email VARCHAR NOT NULL UNIQUE,
    phone VARCHAR NOT NULL UNIQUE
);

CREATE TABLE sessions (
    id SERIAL PRIMARY KEY,
    name text
);

CREATE TABLE ticket (
    id SERIAL PRIMARY KEY,
    session_id INT NOT NULL REFERENCES sessions(id),
    row INT NOT NULL check (row > 0 and row < 13),
    cell INT NOT NULL check (cell > 0 and cell < 13),
    user_id INT NOT NULL REFERENCES users(id),
    unique (row, cell, session_id)
);