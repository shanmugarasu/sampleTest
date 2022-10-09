mkdir actions-runner; cd actions-runner
Invoke-WebRequest -Uri https://github.com/actions/runner/releases/download/v2.298.2/actions-runner-win-x64-2.298.2.zip -OutFile actions-runner-win-x64-2.298.2.zip
Add-Type -AssemblyName System.IO.Compression.FileSystem ; [System.IO.Compression.ZipFile]::ExtractToDirectory("$PWD/actions-runner-win-x64-2.298.2.zip", "$PWD")
./config.cmd --url https://github.com/shanmugarasu/sampleTest --token ACNDN46TQQ5WYWGKFPFOLCLDINRWO
./run.cmd
