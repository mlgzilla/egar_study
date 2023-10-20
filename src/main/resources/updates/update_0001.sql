CREATE TABLE public.employee (
                               id int4 NOT NULL,
                               first_name varchar NOT NULL,
                               middle_name varchar NULL,
                               second_name varchar NOT NULL,
                               phone_number varchar NULL,
                               card_number int4 NULL,
                               contract_type varchar NOT NULL,
                               CONSTRAINT person_pk PRIMARY KEY (id)
);
