#!/bin/sh

echo "========== Executing postconfigure.sh =========="

/opt/eap/bin/jboss-cli.sh --file=${JBOSS_HOME}/extensions/postconfigure.cli

echo "========== postconfigure.sh done =========="