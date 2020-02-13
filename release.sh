#! /bin/bash

export SCALAJS_VERSION=0.6.32
sbt clean +test +publishSigned sonatypeBundleUpload sonatypeReleaseAll
export SCALAJS_VERSION=1.0.0
sbt clean +test +publishSigned sonatypeBundleUpload sonatypeReleaseAll
