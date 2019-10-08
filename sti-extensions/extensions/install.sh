#!/usr/bin/env bash

set -x

echo "XXX install.sh"
injected_dir=$1

cp -rf ${injected_dir} $JBOSS_HOME/extensions

