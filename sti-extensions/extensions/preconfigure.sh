#!/bin/sh

echo "========== Executing preconfigure.sh =========="

/opt/eap/bin/jboss-cli.sh --file=${JBOSS_HOME}/extensions/preconfigure.cli

echo "========== preconfigure.sh done =========="