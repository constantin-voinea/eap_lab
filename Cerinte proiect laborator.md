- Fiecare student va lucra la un proiect individual.
- Proiectul este structurat în mai multe etape.
- Condiții de punctare a proiectelor:
    • să nu prezinte erori de compilare
    • să se implementeze cerințele date


Termene de avut in vedere pe etape:
    • Etapa I: 4 aprilie 2022
    • Etapa II: 2 mai 2022
    • Etapa III: 23 mai 2022


Etapa I:
1) Definirea sistemului
    Să se creeze o lista pe baza temei alese cu cel puțin 10 acțiuni/interogări care se pot face în cadrul sistemului și
o lista cu cel puțin 8 tipuri de obiecte.

2) Implementare
    Sa se implementeze în limbajul Java o aplicație pe baza celor definite la primul punct.
    Aplicația va conține:
     • clase simple cu atribute private / protected și metode de acces
     • cel puțin 2 colecții diferite capabile să gestioneze obiectele definite anterior (ex: List, Set, Map, etc.)
       dintre care cel puțin una sa fie sortata – se vor folosi array-uri uni- /bidimensionale în cazul în care
       nu se parcurg colectiile pana la data checkpoint-ului.
     • utilizare moștenire pentru crearea de clase adiționale și utilizarea lor în cadrul colecțiilor;
     • cel puțin o clasă serviciu care sa expună operațiile sistemului
     • o clasa Main din care sunt făcute apeluri către servicii


Etapa II:
1)	Extindeți proiectul din prima etapa prin realizarea persistentei utilizând fișiere:
    • Se vor realiza fișiere de tip CSV pentru cel puțin 4 dintre clasele definite în prima etapa.
        Fiecare coloana din fișier este separata de virgula. Exemplu:nume,prenume,varsta
    • Se vor realiza servicii singleton generice pentru scrierea și citirea din fișiere;
    • La pornirea programului se vor încărca datele din fișiere utilizând serviciile create;

2)	Realizarea unui serviciu de audit
    Se va realiza un serviciu care sa scrie într-un fișier de tip CSV de fiecare data când este executată una dintre acțiunile descrise în prima etapa.
    Structura fișierului: nume_actiune, timestamp


Etapa III:
Înlocuiți serviciile realizate în etapa a II-a cu servicii care sa asigure persistenta utilizând baza de date folosind JDBC.
Să se realizeze servicii care sa expună operații de tip create, read, update si delete pentru cel puțin 4 dintre clasele definite.

Teme sugerate:
1) catalog (student, materie, profesor)
2) biblioteca (sectiuni, carti, autori, cititori)
3) programare cabinet medical (client, medic, programare)
4) gestiune stocuri magazin (categorii, produse, distribuitori)
5) aplicatie bancara (conturi,extras de cont, tranzactii, carduri, servicii)
6) platfora e-learning(cursuri, utilizatori, cursanti, quizuri)
7) sistem licitatii (licitatii, bids, produse, utilizatori)
8) platforma food delivery(localuri, comenzi, soferi, useri)
9) platforma imprumuturi carti - tip bookster (companii afiliate, utilizatori, carti)
10) platforma e-ticketing (evenimente, locatii, clienti)
