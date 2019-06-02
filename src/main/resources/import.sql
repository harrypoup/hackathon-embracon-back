insert into clientes (id, cpf, email, idade, nome, telefone) values (1,'382.142.634-92', 'enoque@gmail.com', '25','Enoque Leal','11984555577');
insert into clientes (id, cpf, email, idade, nome, telefone) values (2,'864.150.375-79', 'jose@gmail.com', '29','Jose Roberto','11980000009');

insert into consorcio (id, descricao, tipo_consorcio) values (1,'Consórcio de moto', 0);
insert into consorcio (id, descricao, tipo_consorcio) values (2,'Consórcio de casa', 1);

insert into parcela (id, status, consorcio_id) values (1, true, 1);
insert into parcela (id, status, consorcio_id) values (2, true, 1);
insert into parcela (id, status, consorcio_id) values (3, true, 1);
insert into parcela (id, status, consorcio_id) values (4, false, 1);
insert into parcela (id, status, consorcio_id) values (5, true, 2);
insert into parcela (id, status, consorcio_id) values (6, true, 2);
insert into parcela (id, status, consorcio_id) values (7, true, 2);
insert into parcela (id, status, consorcio_id) values (8, true, 2);
insert into parcela (id, status, consorcio_id) values (9, true, 2);
insert into parcela (id, status, consorcio_id) values (10, false, 2);

insert into usuarios (id, senha, tipo, usuario, cliente_id) values (1,'123456', 0, 'enoqueleal', 1);
insert into usuarios (id, senha, tipo, usuario, cliente_id) values (2,'654321', 1, 'joseroberto', 2);

insert into cliente_consorcio (cliente_id, consorcio_id) values (1, 1);
insert into cliente_consorcio (cliente_id, consorcio_id) values (2, 2);
