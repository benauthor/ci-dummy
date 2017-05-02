.PHONY: build test deploy

build:
	lein uberjar

test:
	lein test

deploy:
	heroku deploy:jar target/uberjar/ci-dummy.jar --app ci-dummy
