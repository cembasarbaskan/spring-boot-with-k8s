create table if not exists test
(
    id uuid not null constraint test_pkey primary key,
    value varchar(255)
);