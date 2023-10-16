CREATE TABLE public.person (
                               id int4 NOT NULL,
                               first_name varchar NOT NULL,
                               middle_name varchar NULL,
                               second_name varchar NOT NULL,
                               phone_number varchar NULL,
                               CONSTRAINT person_pk PRIMARY KEY (id)
);
