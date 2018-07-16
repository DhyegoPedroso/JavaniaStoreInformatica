CREATE DATABASE dhystoreinformatica;
USE dhystoreinformatica;


CREATE TABLE Endereco (
idEndereco INT(6) PRIMARY KEY AUTO_INCREMENT,
logradouro VARCHAR(40) NOT NULL,
complemento VARCHAR(30) NOT NULL,
numero VARCHAR(6) NOT NULL,
bairro VARCHAR(20) NOT NULL,
cidade VARCHAR(20) NOT NULL,
uf VARCHAR(2) NOT NULL,
pais VARCHAR(25) NOT NULL,
cep VARCHAR(9) NOT NULL);
  
CREATE TABLE Cliente (
idCliente INT(6) PRIMARY KEY AUTO_INCREMENT,
nomeCLiente VARCHAR(45) NOT NULL,
sexoCliente VARCHAR(10) NOT NULL,
emailCliente VARCHAR(30) NOT NULL,
telefoneCliente VARCHAR(15) NOT NULL,
celularCliente VARCHAR(15) NOT NULL,
cpfCliente VARCHAR(14) NOT NULL,
rgCliente VARCHAR(12) NOT NULL,
dataCadastro DATETIME NOT NULL,
dataNascimento DATE NOT NULL,
idEndereco INT(6) NOT NULL);


CREATE TABLE  Fornecedor (
idFornecedor INT(6) PRIMARY KEY AUTO_INCREMENT,
nomeFornecedor VARCHAR(45) NOT NULL,
emailFornecedor VARCHAR(30) NOT NULL,
telefoneFornecedor VARCHAR(15) NOT NULL,
celularFornecedor VARCHAR(15) NOT NULL,
cnpjFornecedor VARCHAR(18) NOT NULL,
ieFornecedor VARCHAR(18) NOT NULL,
dataCadastro DATETIME NOT NULL,
idEndereco INT(6) NOT NULL);


CREATE TABLE Produto (
idProduto INT(6) PRIMARY KEY AUTO_INCREMENT,
nomeProduto VARCHAR(40) NOT NULL,
descProduto VARCHAR(40) NOT NULL,
qtdProduto INT(6) NOT NULL,
valorProduto DOUBLE NOT NULL,
idMarca int(6) NOT NULL,
idFornecedor INT(6) NOT NULL);

CREATE TABLE Marca(
idMarca int(6) primary key auto_increment,
nomeMarca varchar(30) not null);


CREATE TABLE Pedido (
idPedido INT(6) PRIMARY KEY AUTO_INCREMENT,
idCliente INT(6) NOT NULL,
valorTotalVenda DOUBLE NOT NULL,
tipoPagamento VARCHAR(15) NOT NULL,
dataCompra DATETIME NOT NULL);


CREATE TABLE  ItemPedido (
idItemPedido INT(6) PRIMARY KEY AUTO_INCREMENT,
idPedido INT(6) NOT NULL,
idProduto INT(6) NOT NULL,
qtdDeItem INT(6) NOT NULL,
valorUnit DOUBLE NOT NULL);


ALTER table Cliente
add FOREIGN KEY(idEndereco) REFERENCES Endereco (idEndereco);

ALTER table Fornecedor
add FOREIGN KEY(idEndereco) REFERENCES Endereco (idEndereco);

ALTER table Produto
add FOREIGN KEY(idMarca) REFERENCES Marca (idMarca);

ALTER table Produto
add FOREIGN KEY(idFornecedor) REFERENCES Fornecedor (idFornecedor);

ALTER table Pedido
add FOREIGN KEY(idCliente) REFERENCES Cliente (idCliente);

ALTER table ItemPedido
add FOREIGN KEY(idPedido) REFERENCES Pedido (idPedido);

ALTER table ItemPedido
add FOREIGN KEY(idProduto) REFERENCES Produto (idProduto);

insert into endereco(logradouro, complemento, numero, bairro, cidade, uf, pais, cep)values
("Rua Mathias","Cond.","132","Sertão","Sao josé","SC","Brasil","88122-400"),
("AV dos Buzios","Cond.","666","Jurere","Floriipa","SC","Brasil","88144-852"),
("Rua dos açores","casa","24","Campeche","Floripa","SC","Brasil","88514-258"),
("Rua das Palmeiras","casa","258","Barreiros","São José","SC","Brasil","88154-985"),
("Rua Ver. Arthur Manoel Mariano","Vitória Center","362","Forquilhinhas","Sao josé","SC","Brasil","88106-517"),
("Rua Vidal Procópio Lohn","Distrito Industrial","251","São José","São José ","SC","Brasil","88104-810"),
("Rua da Camélias","Salas 503/506/508","345","Campinas","São José","SC","Brasil","88106-517"),
("Rua Santos Saraiva","na","1731","Estreito","Florianópolis ","SC","Brasil","88106-517"),
("Rua Ivo José Souza","Loja 1","140","Colônia Santana","São José","SC","Brasil","88106-517");

insert into cliente(nomeCliente, sexoCliente, emailCliente, telefoneCliente, celularCliente, cpfCliente, rgCliente, dataCadastro, dataNascimento, idEndereco)values
("Dhyego Pedroso","Masculino","Dhyego.pedroso@Gmail.com","(48) 3033-8547","(48) 98455-8547","053.343.665-86","25.506.113-4",now(), '1986-05-21' ,1),
("Ricardo Schmitd","Masculino","Ricardao@Gmail.com","(48) 3013-3298","(48) 98541-2158","085.214.665-88","18.271.639-9",now(), '1990-07-20' ,2),
("Felipe Danea","Masculino","danico@Gmail.com","(48) 3032-8852","(48) 98534-2187","003.014.851-05","17.183.738-1",now(), '1994-02-10' ,3),
("Silvio Junior","Masculino","Silvio.jr@Gmail.com","(48) 3035-5247","(48) 98503-1057","095.985.215-74","44.925.564-5",now(), '1975-10-30' ,4);

insert into fornecedor(nomeFornecedor, emailFornecedor, telefoneFornecedor, celularFornecedor, cnpjFornecedor,ieFornecedor,dataCadastro, idEndereco)values
("infohard","infohard@infohard.com.br", "(48) 3021-8541","(48) 98514-8514","95.842.158/0001-15","218.957.742",now(),5),
("Pauta Distribuição","Pauta@Pauta.com.br", "(48) 3031-8854","(48) 92196-2154","40.778.115/0001-26","590.959.360",now(),6),
("Mazer Distribuidora","Mazer@Mazer.com.br", "(48) 3020-2141","(48) 98520-0320","12.398.061/0001-38","995.400.130",now(),7),
("Districomp Distribuidora","Districomp@Districomp.com.br", "(48) 3030-0214","(48) 98269-0014","52.716.916/0001-46","899.225.381",now(),8),
("4u Network","4u@4u.com.br", "(48) 3025-8514","(48) 95147-0250","32.417.718/0001-74","705.271.455",now(),9);

insert into Marca(nomeMarca)values
("Intel"),
("AMD"),
("Gigabyte"),
("Asus"),
("Dell"),
("Corsair"),
("Cooler Master"),
("LG"),
("Razer"),
("PCYES"),
("XFX"),
("EVGA"),
("C3 Tech"),
("Sony"),
("Microsoft"),
("Acer");

insert into produto(nomeProduto, descProduto, qtdProduto, valorProduto, idMarca, idFornecedor)values
("Teclado","Semi mecanico RGB", 150, 250.00, 6,1),
("Teclado","mecanico RED", 100, 158.00, 7,2),
("Gabinete","Full Tower RGB", 200, 750.00, 7,1),
("Monitor","Super WideScreen 29 polegadas", 300, 1400.00, 5,3),
("Monitor","Predador X5", 50, 2850.00, 4,5),
("HeadSet","7.1 surround", 200, 550.00, 9,4),
("Memoria","DDR3 4GB 1600MHZ VENGEANCE", 150, 250.00, 6,1),
("Memoria","DDR3 8GB 1600MHZ VENGEANCE ", 150, 350.00, 6,3),
("Memoria","DDR4 8GB 2400MHZ", 150, 450.00, 6 ,4),
("Placa de Video","GTX 1080TI 11GB", 200, 4500.00, 3,5),
("Placa de Video","GTX TITAN 12GB", 200, 5500.00, 3,2),
("Placa Mãe","G1 Gammer RGB", 300, 1250.00, 3,3),
("Placa Mãe","Predador X3", 250, 1250.00, 4,5),
("Processador","i9 8950hk", 150, 6589.00, 1,1);












