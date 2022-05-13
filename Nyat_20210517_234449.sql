--
-- PostgreSQL database dump
--

-- Dumped from database version 13.0
-- Dumped by pg_dump version 13.1

SET statement_timeout = 0;
SET lock_timeout = 0;
SET idle_in_transaction_session_timeout = 0;
SET client_encoding = 'UTF8';
SET standard_conforming_strings = on;
SELECT pg_catalog.set_config('search_path', '', false);
SET check_function_bodies = false;
SET xmloption = content;
SET client_min_messages = warning;
SET row_security = off;

SET default_tablespace = '';

SET default_table_access_method = heap;

--
-- Name: Cihaz; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public."Cihaz" (
    id character(30),
    "Renk" character(30) NOT NULL,
    "Marka" character(30) NOT NULL,
    "Model" character(30) NOT NULL
);


ALTER TABLE public."Cihaz" OWNER TO postgres;

--
-- Name: Kullanici; Type: TABLE; Schema: public; Owner: postgres
--

CREATE TABLE public."Kullanici" (
    "KullaniciAdi" character(30),
    "Sifre" character(30),
    "CihazId" character(1)
);


ALTER TABLE public."Kullanici" OWNER TO postgres;

--
-- Data for Name: Cihaz; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public."Cihaz" VALUES
	('1                             ', 'Mavi                          ', 'a                             ', 'c                             '),
	('2                             ', 'Beyaz                         ', 'b                             ', 'xxx                           ');


--
-- Data for Name: Kullanici; Type: TABLE DATA; Schema: public; Owner: postgres
--

INSERT INTO public."Kullanici" VALUES
	('furkan                         ', '123                           ', '1'),
	('a                             ', '1                             ', '2');


--
-- Name: Cihaz unique_Cihaz_id; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public."Cihaz"
    ADD CONSTRAINT "unique_Cihaz_id" UNIQUE (id);


--
-- Name: Kullanici unique_Kullanici_KullaniciAdi; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public."Kullanici"
    ADD CONSTRAINT "unique_Kullanici_KullaniciAdi" UNIQUE ("KullaniciAdi");


--
-- Name: Kullanici unique_Kullanici_Sifre; Type: CONSTRAINT; Schema: public; Owner: postgres
--

ALTER TABLE ONLY public."Kullanici"
    ADD CONSTRAINT "unique_Kullanici_Sifre" UNIQUE ("Sifre");


--
-- PostgreSQL database dump complete
--

