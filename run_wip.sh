#!/bin/bash

sbt -Dbrowser=chrome 'test-only suites.RunWip'
