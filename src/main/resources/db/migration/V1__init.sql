drop table if exists person;

create table person
(
	id varchar(36) not null
		constraint pk_person
			primary key,
    tenant_id varchar(36),

	first_name varchar(255),
	last_name varchar(255),

    address_id varchar(36) NOT NULL,
    version bigint default 0
);

create index idx_person_tenant_id on person(tenant_id);

drop table if exists person_audit;

create table person_audit
(
	id varchar(36) not null
		constraint pk_person_audit
			primary key,
    tenant_id varchar(36),

    reference_id varchar(255),
    operation varchar(255),
    created_by varchar(255),
    created_at date,
    modified_by varchar(255),
    modified_at date,
    oldvalue TEXT,
    newvalue TEXT
);

create index idx_person_audit_tenant_id on person_audit(tenant_id);

drop table if exists address;

create table address
(
	id varchar(36) not null
		constraint pk_address
			primary key,

    tenant_id varchar(36),

	street varchar(255) NULL,
	city varchar(255) NULL,
	version bigint default 0
);

drop table if exists address_audit;

create table address_audit
(
	id varchar(36) not null
		constraint pk_address_audit
			primary key,
    tenant_id varchar(36),

    reference_id varchar(255),
    operation varchar(255),
    created_by varchar(255),
    created_at date,
    modified_by varchar(255),
    modified_at date,
    oldvalue TEXT,
    newvalue TEXT
);

drop table if exists sdops_head;

create table sdops_head
(
    id                           varchar primary key,
    start_date                   varchar not null,
    end_date                     varchar not null,
    internal_version             varchar not null,
    kbv_version                  varchar not null
);

drop table if exists sdops_code;

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