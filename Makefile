.PHONY: build test

build:
	lein uberjar

test:
	lein test
