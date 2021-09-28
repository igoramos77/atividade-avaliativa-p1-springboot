INSERT INTO category(name, description) VALUES (
    'Placa de Vídeo',
    'Lorem ipsum'
);

INSERT INTO product(description, inventory_quantity, unity_value, created_at, updated_at) VALUES (
    'Placa de Vídeo RTX 3080 Ti',
     50,
    '9349.00',
    CURRENT_TIMESTAMP(),
    CURRENT_TIMESTAMP()
);

INSERT INTO productCategory(product_id, category_id) VALUES (1, 1);

INSERT INTO images(product_id, description,created_at, updated_at) VALUES (
     1,
     'https://images.kabum.com.br/produtos/fotos/169103/placa-de-video-gigabyte-nvidia-geforce-rtx-3080-ti-vision-oc-12g-12-gb-gddr6x-rgb-fusion-2-0-ray-tracing-dlss-gv-n308tvision-oc-12gd_1625057038_g.jpg',
     CURRENT_TIMESTAMP(),
     CURRENT_TIMESTAMP()
 );

INSERT INTO images(product_id, description,created_at, updated_at) VALUES (
  1,
  'https://images.kabum.com.br/produtos/fotos/169103/placa-de-video-gigabyte-nvidia-geforce-rtx-3080-ti-vision-oc-12g-12-gb-gddr6x-rgb-fusion-2-0-ray-tracing-dlss-gv-n308tvision-oc-12gd_1625057037_g.jpg',
  CURRENT_TIMESTAMP(),
  CURRENT_TIMESTAMP()
);

INSERT INTO images(product_id, description,created_at, updated_at) VALUES (
  1,
  'https://images.kabum.com.br/produtos/fotos/169103/placa-de-video-gigabyte-nvidia-geforce-rtx-3080-ti-vision-oc-12g-12-gb-gddr6x-rgb-fusion-2-0-ray-tracing-dlss-gv-n308tvision-oc-12gd_1625057039_g.jpg',
  CURRENT_TIMESTAMP(),
  CURRENT_TIMESTAMP()
);

