# Catster

## What is this?

This is an app, created by Liam Axon, Yuanzhe Liu, and Amanda Shen.

## How is it structred?

The repo is organized into two folders: `frontend` and `backend`. Since these are separate project spaces (which rely heavily on each other), most files should be in one folder or the other.

## The Frontend
See https://github.com/liaxon/EyebrowApp?fbclid=IwAR3Qm2YhBPxOsKN9BVpDjhHXKPGiyKr6-EWfOAS0qftAwW41FLmYmZprGXY

## The Backend
This repo is for BE of the app. 

## The Backend Deployment
We use heroku for deplument
Install the Heroku CLI
Download and install the Heroku CLI.

If you haven't already, log in to your Heroku account and follow the prompts to create a new SSH public key.

`$ heroku login`

Clone the repository
Use Git to clone caster-app-heroku's source code to your local machine.

```
$ heroku git:clone -a caster-app-heroku
$ cd caster-app-heroku
```

Deploy your changes
Make some changes to the code you just cloned and deploy them to Heroku using Git.

```
$ git add .
$ git commit -am "make it better"
$ git push heroku master
```

## APIs
https://caster-app-heroku.herokuapp.com/getUser?uid=1
https://caster-app-heroku.herokuapp.com/debug


