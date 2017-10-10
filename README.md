# COMP 422 - Wireless/Mobile Softw Dev: Quipa
## Team Members
- Catherine Litten
- Pinky Sindhu
- Percy Soliz
- Chris Huang

## Description
QUIPA App will allow people to help people categorized as NEET to create a virtual profile in a couple of simple steps. This profile will focus on the contact information and skills of the prospect (person having a virtual profile), therefore increasing their chances of getting a job and increasing their reputation and ranking with in the local market.

## Import Git Project in eclipse
1) Create directory "QuipaServer" inside of your workspace  
2) Execute the following code inside of that directory once Git is installed in your machine: 
```
git init  
git remote add QuipaServer https://github.com/psolizrodriguez/QuipaServer.git  
git pull QuipaServer master
```
3) Create a Dynamic Web with tomcat 9 as container on eclipse using that path  
4) The class **com.quipa.common.controllers.MainController** has the code to test and insert all the dummy data
  
## Main Controller with Dummy Data
[MainController.java](./src/com/quipa/common/controllers/MainController.java)

## Data Base Connection Details
**Host:** 18.220.231.8  
**Database:** quipa  
**User:** quipa  
**Password:** quipa  

## Class Diagram
![Quipa](https://i.imgur.com/FdPdTWU.gif)

## Entity Relationship Diagram
![Quipa_ERD](https://i.imgur.com/WL64gh4.png)