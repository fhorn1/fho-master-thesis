drop table if exists sdops_code;
drop table if exists sdops_head;

create table sdops_head
(
    id                           varchar primary key,
    start_date                   varchar not null,
    end_date                     varchar not null,
    internal_version             varchar not null,
    kbv_version                  varchar not null
);

create table sdops_code
(
    id                         varchar primary key,
    head_id                    varchar not null references sdops_head (id),
    op_code                    varchar not null,
    description                varchar not null,
    start_date                 varchar not null,
    end_date                   varchar,
    medical_motivation         boolean,
    side_location              boolean not null,
    category                   varchar,
    category_info              varchar
);

drop index if exists idx_sdops_code_head_and_op_code;
drop index if exists idx_sdops_code_head_and_description;

create index idx_sdops_code_head_and_op_code on sdops_code(head_id, op_code);
create index idx_sdops_code_head_and_description on sdops_code(head_id, description);