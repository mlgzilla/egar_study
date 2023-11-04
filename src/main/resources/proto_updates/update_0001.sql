CREATE TABLE public.mechanic (
                                 id int4 NOT NULL,
                                 employee_id int4 NOT NULL,
                                 workplace_number int4 NOT NULL,
                                 speciality varchar NULL,
                                 reports varchar NULL,
                                 CONSTRAINT mechanic_pk PRIMARY KEY (id),
                                 CONSTRAINT mechanic_fk FOREIGN KEY (employee_id) REFERENCES public.employee(id)
);

ALTER TABLE public.employee DROP CONSTRAINT person_pk;
ALTER TABLE public.employee ADD CONSTRAINT employee_pk PRIMARY KEY (id);
ALTER TABLE public.mechanic ADD CONSTRAINT mechanic_fk FOREIGN KEY (employee_id) REFERENCES public.employee(id);

CREATE TABLE public.manager (
                                id int4 NOT NULL,
                                department varchar NOT NULL,
                                reports varchar NULL
);

ALTER TABLE public.manager ADD CONSTRAINT manager_pk PRIMARY KEY (id);
ALTER TABLE public.manager ADD employee_id int4 NOT NULL;
ALTER TABLE public.manager ADD CONSTRAINT manager_fk FOREIGN KEY (employee_id) REFERENCES public.employee(id);

CREATE TABLE public."document" (
                                   id int4 NOT NULL,
                                   name varchar NOT NULL,
                                   page_count int4 NOT NULL,
                                   "path" varchar NOT NULL,
                                   creation_date timestamp NOT NULL,
                                   clearance varchar NULL,
                                   employee_id int4 NOT NULL,
                                   CONSTRAINT document_pk PRIMARY KEY (id),
                                   CONSTRAINT document_fk FOREIGN KEY (employee_id) REFERENCES public.employee(id)
);

ALTER TABLE public.mechanic RENAME COLUMN workplace_number TO workplace_id;
ALTER TABLE public."document" RENAME COLUMN clearance TO clearance_level;
ALTER TABLE public."document" ALTER COLUMN clearance_level TYPE int4 USING clearance_level::int4;

ALTER TABLE public."document" ADD department varchar NOT NULL;

CREATE TABLE public.workplace (
                                  id int4 NOT NULL,
                                  inventory varchar NOT NULL,
                                  "location" varchar NOT NULL
);
ALTER TABLE public.workplace ADD CONSTRAINT workplace_pk PRIMARY KEY (id);
ALTER TABLE public.mechanic ADD CONSTRAINT mechanic_fk2 FOREIGN KEY (workplace_id) REFERENCES public.workplace(id);

CREATE TABLE public.tasks (
                              id int4 NOT NULL,
                              name varchar NOT NULL,
                              description varchar NOT NULL,
                              due_time timestamp NULL,
                              assignee int4 NOT NULL,
                              status varchar NOT NULL,
                              CONSTRAINT tasks_pk PRIMARY KEY (id),
                              CONSTRAINT tasks_fk FOREIGN KEY (assignee) REFERENCES public.employee(id)
);

CREATE TABLE public.report (
                               id int4 NOT NULL,
                               "name" varchar NOT NULL,
                               description varchar NOT NULL,
                               date_filed timestamp NOT NULL,
                               task_id int4 NOT NULL,
                               employee_id int4 NOT NULL,
                               CONSTRAINT report_pk PRIMARY KEY (id),
                               CONSTRAINT report_fk FOREIGN KEY (employee_id) REFERENCES public.employee(id),
                               CONSTRAINT report_fk_1 FOREIGN KEY (task_id) REFERENCES public.tasks(id)
);

ALTER TABLE public.mechanic DROP COLUMN reports;
ALTER TABLE public.manager DROP COLUMN reports;
ALTER TABLE public.report DROP CONSTRAINT report_fk;