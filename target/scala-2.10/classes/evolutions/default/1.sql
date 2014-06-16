# --- First database schema

# --- !Ups

create table card (
  id                        bigint not null,
  match_id                  bigint,
  team_id                   bigint,
  player_id                 bigint,
  type                      bigint,
  minute                    bigint,
  constraint pk_card primary key (id))
;

create table gallery (
	id                        bigint not null,
	match_id                  bigint,
	path                      varchar(255),
	constraint pk_gallery primary key (id))
;

create table game (
  id                        bigint not null,
  season_id                 bigint,
  name                      varchar(255),
  constraint pk_game primary key (id))
;

create table goal (
  id                        bigint not null,
  match_id                  bigint,
  team_id                   bigint,
  player_id                 bigint,
  minute                    bigint,
  constraint pk_goal primary key (id))
;

create table lineup (
  id                        bigint not null,
  match_id                  bigint,
  team_id                   bigint,
  minute                    bigint,
  player1_id                bigint,
  player2_id                bigint,
  position                  bigint,
  constraint pk_lineup primary key (id))
;

create table live (
  id                        bigint not null,
  match_id                  bigint,
  minute                    bigint,
  text                      text,
  status                    bigint,
  constraint pk_live primary key (id))
;

create table match (
	id                        bigint not null,
	game_id                   bigint,
	queue                     bigint,
	statistics_id             bigint,
	referee_id                bigint,
	team1_id                  bigint,
	team2_id                  bigint,
	score1                    bigint,
	score2                    bigint,
	score1_half               bigint,
	score2_half               bigint,
	status                    bigint,
	match_date                timestamp,
	weather                   varchar(255),
	viewers                   bigint,
	constraint pk_match primary key (id))
;

create table player (
	id                        bigint not null,
	team_id                   bigint,
	lastname                  varchar(255),
	firstname                 varchar(255),
	date_birth                timestamp,
	status                    integer,
	photo                     varchar(255),
	height                    integer,
	weight                    integer,
	position                  varchar(255),
	number                    integer,
	constraint pk_player primary key (id))
;

create table referee (
	id                        bigint not null,
	lastname                  varchar(255),
	firstname                 varchar(255),
	city                      varchar(255),
	constraint pk_referee primary key (id))
;

create table season (
  id                        bigint not null,
  year_start                timestamp,
  year_end                  timestamp,
  constraint pk_season primary key (id))
;

create table statistic (
	id                        bigint not null,
	goals1                    bigint,
	goals2                    bigint,
	goals1_half               bigint,
	goals2_half               bigint,
	goalpost1                 bigint,
	goalpost2                 bigint,
	goalpost1_half            bigint,	
	goalpost2_half            bigint,
	attempts_target1          bigint,
	attempts_target2          bigint,
	attempts_target1_half     bigint,
	attempts_target2_half     bigint,
	attempts_offtarget1       bigint,
	attempts_offtarget2       bigint,
	attempts_offtarget1_half  bigint,
	attempts_offtarget2_half  bigint,
	attempts_blocked1         bigint,
	attempts_blocked2         bigint,
	attempts_blocked1_half    bigint,
	attempts_blocked2_half    bigint,
	corners1                  bigint,
	corners2                  bigint,
	corners1_half             bigint,
	corners2_half             bigint,
	fouls1                    bigint,
	fouls2                    bigint,
	fouls1_half               bigint,
	fouls2_half               bigint,	
	offsides1                 bigint,
	offsides2                 bigint,
	offsides1_half            bigint,
	offsides2_half            bigint,
	yellow_cards1             bigint,
	yellow_cards2             bigint,
	yellow_cards1_half        bigint,
	yellow_cards2_half        bigint,
	red_cards1                bigint,
	red_cards2                bigint,
	red_cards1_half           bigint,
	red_cards2_half           bigint,
	constraint pk_statistic primary key (id))
;

create table team (
	id                        bigint not null,
	name                      varchar(255),
	crest                     varchar(255),
	constraint pk_zespol primary key (id))
;

create table user (
    id                        bigint not null,
	login                     varchar(255),
	email                     varchar(255),
	password                  varchar(255),
	name                      varchar(255),
	lastname                  varchar(255),
	status                    bigint,
	constraint pk_user primary key (login))
;

create table video (
	id                        bigint not null,
	vmatch_id                  bigint,
	name                      varchar(255),
	path                      varchar(255),
	constraint pk_video primary key (id))
;

create sequence card_seq start with 5;
create sequence gallery_seq start with 2;
create sequence game_seq start with 5;
create sequence goal_seq start with 5;
create sequence lineup_seq start with 5;
create sequence live_seq start with 5;
create sequence match_seq start with 5;
create sequence player_seq start with 20;
create sequence referee_seq  start with 12;
create sequence season_seq start with 5;
create sequence statistic_seq start with 5;
create sequence team_seq start with 17;
create sequence user_seq start with 4;
create sequence video_seq start with 5;

alter table card add constraint fk_card_match_1 foreign key (match_id) references match (id) on delete restrict on update restrict;
create index ix_card_match_1 on card (match_id);
alter table card add constraint fk_card_team_2 foreign key (team_id) references team (id) on delete restrict on update restrict;
create index ix_card_team_2 on card (team_id);
alter table card add constraint fk_card_player_3 foreign key (player_id) references player (id) on delete restrict on update restrict;
create index ix_card_player_3 on card (player_id);
alter table gallery add constraint fk_gallery_match_4 foreign key (match_id) references match (id) on delete restrict on update restrict;
create index ix_gallery_match_4 on gallery (match_id);
alter table game add constraint fk_game_season_5 foreign key (season_id) references season (id) on delete restrict on update restrict;
create index ix_game_season_5 on game (season_id);
alter table goal add constraint fk_goal_match_6 foreign key (match_id) references match (id) on delete restrict on update restrict;
create index ix_goal_match_6 on goal (match_id);
alter table goal add constraint fk_goal_team_7 foreign key (team_id) references team (id) on delete restrict on update restrict;
create index ix_goal_team_7 on goal (team_id);
alter table goal add constraint fk_goal_player_8 foreign key (player_id) references player (id) on delete restrict on update restrict;
create index ix_goal_player_8 on goal (player_id);
alter table lineup add constraint fk_lineup_match_9 foreign key (match_id) references match (id) on delete restrict on update restrict;
create index ix_lineup_match_9 on lineup (match_id);
alter table lineup add constraint fk_lineup_team_10 foreign key (team_id) references team (id) on delete restrict on update restrict;
create index ix_lineup_team_10 on lineup (team_id);
alter table lineup add constraint fk_lineup_player1_11 foreign key (player1_id) references player (id) on delete restrict on update restrict;
create index ix_lineup_player1_11 on lineup (player1_id);
alter table lineup add constraint fk_lineup_player2_12 foreign key (player2_id) references player (id) on delete restrict on update restrict;
create index ix_lineup_player2_12 on lineup (player2_id);
alter table live add constraint fk_live_match_13 foreign key (match_id) references match (id) on delete restrict on update restrict;
create index ix_live_match_13 on live (match_id);
alter table match add constraint fk_match_game_14 foreign key (game_id) references game (id) on delete restrict on update restrict;
create index ix_match_game_14 on match (game_id);
alter table match add constraint fk_match_statistics_15 foreign key (statistics_id) references statistic (id) on delete restrict on update restrict;
create index ix_match_statistics_15 on match (statistics_id);
alter table match add constraint fk_match_referee_16 foreign key (referee_id) references referee (id) on delete restrict on update restrict;
create index ix_match_referee_16 on match (referee_id);
alter table match add constraint fk_match_team1_17 foreign key (team1_id) references team (id) on delete restrict on update restrict;
create index ix_match_team1_17 on match (team1_id);
alter table match add constraint fk_match_team2_18 foreign key (team2_id) references team (id) on delete restrict on update restrict;
create index ix_match_team2_18 on match (team2_id);
alter table player add constraint fk_player_team_19 foreign key (team_id) references team (id) on delete restrict on update restrict;
create index ix_player_team_19 on player (team_id);
alter table video add constraint fk_video_vmatch_20 foreign key (vmatch_id) references match (id) on delete restrict on update restrict;
create index ix_video_vmatch_20 on video (vmatch_id);

# --- !Downs

SET REFERENTIAL_INTEGRITY FALSE;
drop table if exists card;
drop table if exists gallery;
drop table if exists game;
drop table if exists goal;
drop table if exists lineup;
drop table if exists live;
drop table if exists match;
drop table if exists player;
drop table if exists referee;
drop table if exists season;
drop table if exists statistic;
drop table if exists team;
drop table if exists user;
drop table if exists video;

SET REFERENTIAL_INTEGRITY TRUE;
drop sequence if exists card_seq;
drop sequence if exists gallery_seq;
drop sequence if exists game_seq;
drop sequence if exists goal_seq;
drop sequence if exists lineup_seq;
drop sequence if exists live_seq;
drop sequence if exists match_seq;
drop sequence if exists player_seq;
drop sequence if exists referee_seq;
drop sequence if exists season_seq;
drop sequence if exists statistic_seq;
drop sequence if exists team_seq;
drop sequence if exists user_seq;
drop sequence if exists video_seq;