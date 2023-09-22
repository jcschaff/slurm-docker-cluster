#!/bin/bash

# this script generates a java client for the openapi.json file in the current directory
# it uses the openapi-generator cli tool to do so
openapi-generator generate -i openapi_37.yaml -g java -o clients/java --additional-properties=hideGenerationTimestamp=true

openapi-generator generate -i openapi_37.yaml -g python -o clients/python --additional-properties=hideGenerationTimestamp=true

