create table itau.clientes(
codigo_cliente integer(6) not null auto_increment,
nome_cliente varchar(50) not null,
idade_cliente int(3) not null,
email_cliente varchar(80) not null,
primary key (codigo_cliente)
);

describe clientes;
desc clientes;

truncate table clientes;

insert into clientes (nome_cliente, idade_cliente, email_cliente)
values ("Rodrigo", 43, "rxpbra@gmail.com"),
("Ana", 33, "ana@gmail.com"),
("Edu", 13, "edu@gmail.com"),
("Jujuba", 5, "rxpbra@gmail.com");

select * from clientes where endereco_cliente="";

drop table clientes;

alter table itau.clientes add column endereco_cliente varchar(80) not null;

update itau.clientes set endereco_cliente = "Rua Jacofer, 161" where codigo_cliente in (1, 2, 3, 4);

delete from clientes where codigo_cliente=12;

create table itau.produtos(
cod_produto int(6) not null auto_increment,
nome_produto varchar(40) not null,
cod_categoria int(3) not null,
preco_venda decimal(8,2) not null,
primary key (cod_produto)
);

insert into itau.produtos
(nome_produto, cod_categoria, preco_venda)
values
("Seguro Vida", 1, 2000.99),
("CDB", 2, 199.85),
("Seguro Auto", 3, 850.99),
("Planos de Saude", 1, 780.50),
("Seguro Residencial", 3, 300.00);

select sum(preco_venda) from itau.produtos where cod_categoria=1;

select * from itau.produtos where preco_venda = (select max(preco_venda) from itau.produtos);

create table itau.categoria (
cod_categoria int(3) not null auto_increment,
tipo_categoria varchar(20) not null,
primary key (cod_categoria)
);

insert into itau.categoria
(tipo_categoria)
values
("prime"),
("basico"),
("flex");

select * from itau.categoria;

drop table itau.produtos;

create table itau.produtos(
cod_produto int(6) not null auto_increment,
nome_produto varchar(40) not null,
cod_categoria int(3) not null,
preco_venda decimal(8,2) not null,
primary key (cod_produto),
foreign key (cod_categoria) references categoria (cod_categoria)
);

select p.cod_produto, p.nome_produto, p.preco_venda, c.tipo_categoria
from produtos p, categoria c
where p.cod_categoria = c.cod_categoria;

alter table produtos rename column categorias to cod_categoria;


create table itau.plano_saude(
cod_plano int(6) not null auto_increment,
cpf int(11) not null,
nome_titular varchar(50) not null,
primary key (cod_plano)
);

create table itau.dependentes(
cod_dependente int(6) not null,
cpf_titular int(11) not null,
nome_dependente varchar(40) not null,
primary key (cod_dependente)
);

insert into itau.plano_saude
(cpf, nome_titular)
values (12345678901, "Edison");

drop table plano_saude;
drop table dependentes;


create database SUPERMERCADO_JOAO;

use SUPERMERCADO_JOAO;

create table SUPERMERCADO_JOAO.produtos(
	id_produto int(5) not null auto_increment,
    nome_produto varchar(40) not null,
    preco_produto decimal(8,2),
    primary key (id_produto)
);

insert into SUPERMERCADO_JOAO.produtos
(nome_produto, preco_produto)
values
("camisa", 10.00),
("oculos", 25.00),
("sapato", 32.99);

create table SUPERMERCADO_JOAO.vendas(
id_venda int(6) not null auto_increment,
data_venda date,
primary key (id_venda)
);

insert SUPERMERCADO_JOAO.vendas
(data_venda)
values
("2020-9-12"),
("2020-9-15"),
("2020-9-20");

create table SUPERMERCADO_JOAO.item_venda(
id_produto int(6) not null,
id_venda int(6) not null,
quantidade int(6) not null,
preco_venda decimal(8,2) not null,
foreign key (id_produto) references produtos(id_produto),
foreign key (id_venda) references vendas(id_venda)
);

insert into SUPERMERCADO_JOAO.item_venda
(id_produto, id_venda, quantidade, preco_venda)
values
(1,1,2,10.00),
(2,1,1,20.00),
(3,2,2,32.00),
(4,3,1,25.00);

select P.id_produto, P.nome_produto, V.id_venda, V.data_venda, I.quantidade, I.preco_venda
from item_venda as I
inner join Vendas as V
on (I.id_produto=V.id_venda)
inner join produtos as P
on (P.id_produto=I.id_produto);

