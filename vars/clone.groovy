def call(String url, String branch){
  echo 'this is cloning app'
                git url: "${url}", branch: "${branch}"
                echo "code clone successfully"
}
