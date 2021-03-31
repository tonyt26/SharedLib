/**
* Visibly echoes stageName
*
* @param stageName  stage name to echo
*/
def visiblyEchoStageName(stageName = env.STAGE_NAME) {
  echo "===== Start of ${stageName} ====="
}