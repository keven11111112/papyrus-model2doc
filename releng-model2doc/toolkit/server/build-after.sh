#--------------------------------------------------------------------------------
# Copyright (c) 2012-2014, 2018 CEA LIST.
#
#    
# All rights reserved. This program and the accompanying materials
# are made available under the terms of the Eclipse Public License 2.0
# which accompanies this distribution, and is available at
# https://www.eclipse.org/legal/epl-2.0/
#
# SPDX-License-Identifier: EPL-2.0
#
# Contributors:
#    Nicolas Bros (Mia-Software)
#	 Camille Letavernier (CEA LIST)
#    Vincent Lorenzo (CEA LIST) adapted for model2doc
#--------------------------------------------------------------------------------

########## publishing ##########

##
## Known variables:
## BUILD_ID=2014-10-01_05-16-17
##
## For stable builds:
## BUILD_ALIAS=M4
##

p2UpdateSiteDir=${WORKSPACE}/source/releng-model2doc/org.eclipse.papyrus.model2doc.p2 
updateSite=${WORKSPACE}/repository

if [ -n "$BUILD_ALIAS" ]; then
  buildType=S
else
  buildType=N
fi

#COMPACT_BUILD_ID="${BUILD_ID//[-_]}"
#COMPACT_BUILD_ID="${COMPACT_BUILD_ID:0:12}"
#COMPACT_BUILD_ID="$(date +%Y%m%d%H%M)"
COMPACT_BUILD_ID="$BUILD_TIMESTAMP"
FULL_BUILD_ID=${buildType}${COMPACT_BUILD_ID}

if [ -n "$BUILD_ALIAS" ]; then
  updateZipName=Papyrus-Model2Doc-Update-${BUILD_ALIAS}.zip
else
  updateZipName=Papyrus-Model2Doc-Update-${FULL_BUILD_ID}.zip
fi
zipName="Papyrus-Model2Doc.zip"

rm -rf tmp
mkdir -p "tmp/$FULL_BUILD_ID"

rm -rf $updateSite
mv $p2UpdateSiteDir $updateSite

# create the update site zip
(cd $updateSite && zip -r $updateZipName *)
mv $updateSite/$updateZipName "tmp/$FULL_BUILD_ID"

(cd tmp && zip -r $zipName *)
mv tmp/$zipName .
