# --- Sample dataset

# --- !Ups
insert into season(id,year_start, year_end) values (1, '2013-01-01', '2014-01-01');
insert into season(id,year_start, year_end) values (2, '2012-01-01', '2013-01-01');
insert into season(id,year_start, year_end) values (3, '2011-01-01', '2012-01-01');

insert into game(id,season_id, name) values (1, 1, 'Ekstraklasa');
insert into game(id,season_id, name) values (2, 2, 'Ekstraklasa');
insert into game(id,season_id, name) values (3, 1, 'Puchar Polski');

insert into referee(id,lastname, firstname, city) values (1, 'Borski', 'Marcin', 'Warszawa');
insert into referee(id,lastname, firstname, city) values (2, 'Frankowski', 'Bartosz', 'Toruń');
insert into referee(id,lastname, firstname, city) values (3, 'Gil', 'Paweł', 'Lublin');
insert into referee(id,lastname, firstname, city) values (4, 'Marciniak', 'Szymon', 'Płock');
insert into referee(id,lastname, firstname, city) values (5, 'Musiał', 'Tomasz', 'Kraków');
insert into referee(id,lastname, firstname, city) values (6, 'Pskit', 'Paweł', 'Łódź');
insert into referee(id,lastname, firstname, city) values (7, 'Raczkowski', 'Paweł', 'Warszawa');
insert into referee(id,lastname, firstname, city) values (8, 'Stefański', 'Daniel', 'Bydgoszcz');
insert into referee(id,lastname, firstname, city) values (9, 'Garbowski', 'Tomasz', 'Kluczbork');
insert into referee(id,lastname, firstname, city) values (10, 'Jakubik', 'Krzysztof', 'Siedlce');
insert into referee(id,lastname, firstname, city) values (11, 'Jarzębak', 'Sebastian', 'Bytom');

insert into team (id,name, crest) values (1,'Śląsk Wrocław', 'crests/slask_wroclaw.gif');
insert into team (id,name, crest) values (2,'Legia Warszawa', 'crests/legia_warszawa.gif');
insert into team (id,name, crest) values (3,'Wisła Kraków', 'crests/wisla_krakow.gif');
insert into team (id,name, crest) values (4,'Ruch Chorzów', 'crests/ruch_chorzow.gif');
insert into team (id,name, crest) values (5,'Lechia Gdańsk', 'crests/lechia_gdansk.gif');
insert into team (id,name, crest) values (6,'Zawisza Bydgoszcz', 'crests/zawisza_bydgoszcz.gif');
insert into team (id,name, crest) values (7,'Lech Poznań', 'crests/lech_poznan.gif');
insert into team (id,name, crest) values (8,'Jagiellonia Białystok', 'crests/jagiellonia_bialystok.gif');
insert into team (id,name, crest) values (9,'Korona Kielce', 'crests/korona_kielce.gif');
insert into team (id,name, crest) values (10,'Podbeskidzie Bielsko-Biała', 'crests/podbeskidzie_bielskobiala.gif');
insert into team (id,name, crest) values (11,'Zagłebie Lubin', 'crests/zaglebie_lubin.gif');
insert into team (id,name, crest) values (12,'Widzew Łódź', 'crests/widzew_lodz.gif');
insert into team (id,name, crest) values (13,'Cracovia', 'crests/cracovia.gif');
insert into team (id,name, crest) values (14,'Pogoń Szczecin', 'crests/pogon_szczecin.gif');
insert into team (id,name, crest) values (15,'Górnik Zabrze', 'crests/gornik_zabrze.gif');
insert into team (id,name, crest) values (16,'Piast Gliwice', 'crests/piast_gliwice.gif');

insert into player (id, team_id, lastname, firstname, date_birth, status, photo, height, weight, position, number) values (1, 1, 'Mila', 'Sebastian', '1982-07-10', 1, 'players/mila.jpg', 178, 67, 'pomocnik', 11);
insert into player (id, team_id, lastname, firstname, date_birth, status, photo, height, weight, position, number) values (2, 1, 'Kelemen', 'Marian', '1979-12-07', 1, 'players/kelemen.jpg', 188, 83, 'bramkarz', 25);
insert into player (id, team_id, lastname, firstname, date_birth, status, photo, height, weight, position, number) values (3, 1, 'Ostrowski', 'Krzysztof', '1982-05-03', 1, 'ostrowski.jpg', 178, 73, 'obrońca', 16);
insert into player (id, team_id, lastname, firstname, date_birth, status, photo, height, weight, position, number) values (4, 1, 'Pawelec', 'Mariusz', '1986-04-14', 1, 'players/pawelec.jpg', 180, 72, 'obrońca', 17);
insert into player (id, team_id, lastname, firstname, date_birth, status, photo, height, weight, position, number) values (5, 1, 'Paraiba', 'Dudu', '1985-03-11', 1, 'players/paraiba.jpg', 181, 71, 'obrońca', 12);
insert into player (id, team_id, lastname, firstname, date_birth, status, photo, height, weight, position, number) values (6, 1, 'Patejuk', 'Sylwester', '1982-11-30', 1, 'players/patejuk.jpg', 188, 80, 'pomocnik', 9);
insert into player (id, team_id, lastname, firstname, date_birth, status, photo, height, weight, position, number) values (7, 1, 'Paixao', 'Flavio', '1984-09-19', 1, 'players/fpaixao.jpg', 184, 75, 'pomocnik', 28);
insert into player (id, team_id, lastname, firstname, date_birth, status, photo, height, weight, position, number) values (8, 1, 'Hołota', 'Tomasz', '1991-01-27', 1, 'players/holota.jpg', 185, 83, 'pomocnik', 6);
insert into player (id, team_id, lastname, firstname, date_birth, status, photo, height, weight, position, number) values (9, 1, 'Dankowski', 'Kamil', '1996-07-22', 1, 'players/dankowski.jpg', 177, 67, 'pomocnik', 30);
insert into player (id, team_id, lastname, firstname, date_birth, status, photo, height, weight, position, number) values (10, 1, 'Machaj', 'Mateusz', '1989-06-26', 1, 'players/machaj.jpg', null, null, 'pomocnik', 8);
insert into player (id, team_id, lastname, firstname, date_birth, status, photo, height, weight, position, number) values (11, 1, 'Pich', 'Robert', '1988-11-12', 1, 'players/pich.jpg', null, null, 'pomocnik', 27);
insert into player (id, team_id, lastname, firstname, date_birth, status, photo, height, weight, position, number) values (12, 1, 'Paixao', 'Marco', '1984-09-19', 1, 'players/paixao.jpg', 185, 79, 'napastnik', 19);
insert into player (id, team_id, lastname, firstname, date_birth, status, photo, height, weight, position, number) values (13, 2, 'Kosecki', 'Jakub', '1990-08-29', 1, 'players/kosecki.jpg', 168, 59, 'pomocnik', null);

insert into user (id, login, email, password, name, lastname, status) values (1, 'test', 'test@test.com', 'test', 'Paweł', 'Lorenc', 2);
insert into user (id, login, email, password, name, lastname, status) values (2, 'lorenc', 'pawlakzn@gmail.com', 'test', 'Tomasz', 'Walkowiak', 1);
insert into user (id, login, email, password, name, lastname, status) values (3, 'kuc', 'p.lorenc@wp.pl', 'test', 'Mateusz', 'Kuc', 0);

insert into statistic(id, goals1, goals2, goals1_half, goals2_half, goalpost1, goalpost2, goalpost1_half, goalpost2_half, attempts_target1, attempts_target2, attempts_target1_half, attempts_target2_half, attempts_offtarget1, attempts_offtarget2, attempts_offtarget1_half, attempts_offtarget2_half, attempts_blocked1, attempts_blocked2, attempts_blocked1_half, attempts_blocked2_half, corners1, corners2, corners1_half, corners2_half, fouls1, fouls2, fouls1_half, fouls2_half, offsides1, offsides2, offsides1_half, offsides2_half, yellow_cards1, yellow_cards2, yellow_cards1_half, yellow_cards2_half, red_cards1, red_cards2, red_cards1_half, red_cards2_half) values (1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
insert into statistic(id, goals1, goals2, goals1_half, goals2_half, goalpost1, goalpost2, goalpost1_half, goalpost2_half, attempts_target1, attempts_target2, attempts_target1_half, attempts_target2_half, attempts_offtarget1, attempts_offtarget2, attempts_offtarget1_half, attempts_offtarget2_half, attempts_blocked1, attempts_blocked2, attempts_blocked1_half, attempts_blocked2_half, corners1, corners2, corners1_half, corners2_half, fouls1, fouls2, fouls1_half, fouls2_half, offsides1, offsides2, offsides1_half, offsides2_half, yellow_cards1, yellow_cards2, yellow_cards1_half, yellow_cards2_half, red_cards1, red_cards2, red_cards1_half, red_cards2_half) values (2, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
insert into statistic(id, goals1, goals2, goals1_half, goals2_half, goalpost1, goalpost2, goalpost1_half, goalpost2_half, attempts_target1, attempts_target2, attempts_target1_half, attempts_target2_half, attempts_offtarget1, attempts_offtarget2, attempts_offtarget1_half, attempts_offtarget2_half, attempts_blocked1, attempts_blocked2, attempts_blocked1_half, attempts_blocked2_half, corners1, corners2, corners1_half, corners2_half, fouls1, fouls2, fouls1_half, fouls2_half, offsides1, offsides2, offsides1_half, offsides2_half, yellow_cards1, yellow_cards2, yellow_cards1_half, yellow_cards2_half, red_cards1, red_cards2, red_cards1_half, red_cards2_half) values (3, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);
insert into statistic(id, goals1, goals2, goals1_half, goals2_half, goalpost1, goalpost2, goalpost1_half, goalpost2_half, attempts_target1, attempts_target2, attempts_target1_half, attempts_target2_half, attempts_offtarget1, attempts_offtarget2, attempts_offtarget1_half, attempts_offtarget2_half, attempts_blocked1, attempts_blocked2, attempts_blocked1_half, attempts_blocked2_half, corners1, corners2, corners1_half, corners2_half, fouls1, fouls2, fouls1_half, fouls2_half, offsides1, offsides2, offsides1_half, offsides2_half, yellow_cards1, yellow_cards2, yellow_cards1_half, yellow_cards2_half, red_cards1, red_cards2, red_cards1_half, red_cards2_half) values (4, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0);

insert into match(id, game_id, queue, statistics_id, referee_id, team1_id, team2_id, score1, score2, score1_half, score2_half, status, match_date, weather, viewers) values (1, 1, 1, 1, 1, 1, 2, 0, 0, 0, 0, 0, '2014-05-14 12:00:00', 'słonecznie', 43200);
insert into match(id, game_id, queue, statistics_id, referee_id, team1_id, team2_id, score1, score2, score1_half, score2_half, status, match_date, weather, viewers) values (2, 2, 6, 2, 2, 3, 4, 3, 0, 2, 0, 1, '2014-06-18 19:00:00', 'deszczowo', 24500);
insert into match(id, game_id, queue, statistics_id, referee_id, team1_id, team2_id, score1, score2, score1_half, score2_half, status, match_date, weather, viewers) values (3, 3, 4, 3, 1, 4, 5, 0, 0, 0, 0, 2, '2014-05-14 12:00:00', 'upalnie', 43200);
insert into match(id, game_id, queue, statistics_id, referee_id, team1_id, team2_id, score1, score2, score1_half, score2_half, status, match_date, weather, viewers) values (4, 1, 2, 4, 2, 3, 3, 2, 2, 1, 0, 3, '2014-06-18 19:00:00', 'pada grad', 14600);

insert into gallery(id, match_id, path) values (1, 1, 'galleries/1/');

insert into video(id, match_id, path) values (1, 1, '<iframe width="640" height="360" src="//www.youtube.com/embed/_UUQVXGr85c" frameborder="0" allowfullscreen></iframe>');

# --- !Downs
delete from gallery;
delete from game;
delete from match;
delete from referee;
delete from team;
delete from player;
delete from season;
delete from statistic;
delete from user;
delete from video;