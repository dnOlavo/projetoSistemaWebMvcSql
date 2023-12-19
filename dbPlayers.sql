create database dbPlayers;
use dbPlayers;
create table tb_players(   
     nome varchar(255),   
     nick varchar(255) primary key,
     jogo varchar(255),
     contato varchar(255)
);
insert into tb_players values ('Olavo Nunes','na1Ts#1995','Valorant','(34) 9 9859-0343');
insert into tb_players values ('Douglas Martins','akinmeister#1990','Valorant','(16) 9 9188-8535');

select nome,nick,jogo,contato from tb_players;