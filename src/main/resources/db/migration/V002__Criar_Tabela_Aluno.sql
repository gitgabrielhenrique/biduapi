Create table aluno(
id bigint not null auto_increment primary key,
nomealuno varchar(150),
cursoid bigint not null
);


Alter table aluno add constraint FK_Aluno_Curso foreign key(cursoid) references curso(id);
insert into aluno(nomealuno,cursoid ) values ('Gabriel Henrique',1);
insert into aluno(nomealuno,cursoid ) values ('Giulia ',2);
insert into aluno(nomealuno,cursoid ) values ('Sarah',3);
insert into aluno(nomealuno,cursoid ) values ('Mirella',4);
insert into aluno(nomealuno,cursoid ) values ('Monique',4);