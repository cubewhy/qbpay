# Auto update qbpay
# Make sure you have git and jdk 17 installed
echo "Fetching..."
git pull
echo "Building from source..."
echo "You must have maven installed."
mvn package -Dmaven.test.skip
echo "Done."