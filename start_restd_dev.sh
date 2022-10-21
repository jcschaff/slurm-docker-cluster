#!/usr/bin/env bash
set -e

username=restd
if id -u "${username}" >/dev/null 2>&1; then
  echo "user ${username} exists"
else
  useradd "${username}"
fi
SLURM_JWT=daemon gosu "${username}" bash -c "/usr/sbin/slurmrestd 0.0.0.0:6888 -vvv"