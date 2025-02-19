
# NBA Data Rest API 

A brief description of what this project does and who it's for

A Rest API that returns statistics for NBA players and franchises. End of Season awards and All Star Teams included. Dated from 1947-48 Season through 2023-24 season. 
## Installation

What you need: 

IDE - IntelliJ preferred OR Java 17+ installed on command prompt or terminal.

MySQL 8.0+ AND WorkBench 8.0+ or DBeaver


If using command prompt or terminal:

1. Download Java 17+ 

```
2. Create new SQL Database and import database dump.  
 
```bash
DumpNBADB.sql
```

3. Run JAR File in command prompt/terminal

```bash
java -jar target/NBAJNProject-0.0.1-SNAPSHOT.jar
  
```
If using IDE:

1. Clone or download the project.

2. Open MySQL Workbench or DBeaver, create a new database.

3. Import database dump file ( DumpNBADB.sql)

4. Open in IntelliJ and select SDK Java 17 or higher.

5. Run the NBAjnProjectApplication class.
   
## API Reference

#### Get all player statistics 

```http
  GET /api/player
```

| Parameter | Type     |Description                |
| :-------- | :------- | :------------------------- |
| `None` | `N/A` | Returns per game career statistics of former and active NBA players from 1947-48 through 2023-24. 

#### Get all teams 

```http
  GET /api/teams
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `  None   | `N/A` | *| Returns information about all current NBA teams. 

#### Get all Western and Eastern Conference champions.
```http
  GET /api/teams/conference-winners
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `  None   | `N/A`    | Returns all conference champions. 

#### Get all NBA Champions
```http
  GET /api/teams/champions 
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `  None   | `N/A`    | Returns all NBA champions as of the 2024 Finals.

#### Get information about a single team.
```http
  GET /api/teams/{franchise}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `franchise  | `String| Returns information about a given team. Use "%20" to make spaces.

#### Get all All-Star selections
```http
  GET /api/all-star
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `  None   | `N/A    | Returns all All-Star selections from beginning through 2023-24 season.

#### Get All-Stars by decade. Ex. 1980s,1990s,2010s.
```http
  GET /api/all-stars/by-decade?decade={decade}
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `  decade   | `Integer   | Returns All-Stars by decade. Ex. 1950s,1960s,1970s,etc.

#### Get all Season Award winners  such as MVP, Defensive Player of the Year, All-NBA, etc.
```http
  GET /api/season-awards
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `  None   | `N/A    | Returns all end of season awards selections from 1947-48 through the 2023-24 season.

#### Get All-NBA Teams
```http
  GET /api/season-awards/all-nba-teams
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `  None   | `N/A    | Returns All-NBA (1st,2nd,3rd) Team selections from 1947-48 through the 2023-24 season.

#### Get All-NBA First Teams
```http
  GET /api/season-awards/all-nba-first-team
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `  None   | `N/A    | Returns All-NBA First Team selections.

#### Get All-NBA Second Teams
```http
  GET /api/season-awards/all-nba-second-team
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `  None   | `N/A    | Returns All-NBA Second Team selections.

#### Get All-NBA Third Teams
```http
  GET /api/season-awards/all-nba-third-team

```
| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `  None   | `N/A    | Returns All-NBA Third Team selections.


#### Get All-Rookie Teams


```http 
  GET /api/season-awards/all-nba-rookie-teams

```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `  None   | `N/A    | Returns All-Rookie (1st and 2nd) teams.


#### Get All-Defensive Teams

```http
GET /api/season-awards/all-defense-teams
```
| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `  None   | `N/A    | Returns All-Defensive Teams(1st and 2nd).

#### Get All-Defense First Teams
```http
  GET /api/season-awards/all-defense-first-team
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `  None   | `N/A    | Returns Al-Defensive First Teams.

#### Get All-Defense Second Teams
```http
  GET /api/season-awards/all-defense-second-team
```

| Parameter | Type     | Description                       |
| :-------- | :------- | :-------------------------------- |
| `  None   | `N/A    | Returns All Defensive Second Teams.





##Data Credits:

The CSV files used for this API were created by [Sumitro Datta].  
Data sourced from [BasketballReference.com](https://www.basketball-reference.com/).

Kaggle Dataset: 
https://www.kaggle.com/datasets/sumitrodatta/nba-aba-baa-stats



## License
MIT License

Copyright (c) [2025] [Joshua Nunoo]

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
[MIT](https://choosealicense.com/licenses/mit/)
