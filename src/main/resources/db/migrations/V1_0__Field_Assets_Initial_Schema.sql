CREATE TABLE users (
    field_id BIGINT PRIMARY KEY AUTO_INCREMENT,
    description VARCHAR(50) NOT NULL,
    farm_id VARCHAR(100) NOT NULL,
    field_name VARCHAR(100) NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

INSERT INTO field_asset_model (field_id , farm_id , description , field_name ) VALUES 
(1 ,1 ,'description notes', 'farm one'),
(2 ,1 ,'description notes', 'farm two'),
(3 ,1 ,'description notes', 'farm three'),
(4 ,1 ,'description notes', 'farm four');


field_id | description | farm_id | field_name