create table user (
    id int not null,
    name text not null
);

create table game (
    id int not null,
    name text not null
);

create table squares (
    id int not null,
    game int not null,
    user int not null,
    x int not null,
    y int not null
);