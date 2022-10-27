CREATE TABLE t_board(
                        board_id Long auto_increment,
                        title varchar (30) not null,
                        content varchar (30) not null,
                        name varchar (30) not null,
                        reg_date timestamp,
                        update_date timestamp,
                        primary key(board_id )
);