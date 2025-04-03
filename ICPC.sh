#!/bin/bash

# Actualizar lista de paquetes
echo "Actualizando la lista de paquetes..."
sudo apt update -y

# Instalar Visual Studio Code
echo "Instalando Visual Studio Code..."
sudo apt install -y wget gpg
wget -qO- https://packages.microsoft.com/keys/microsoft.asc | gpg --dearmor > microsoft.gpg
sudo mv microsoft.gpg /usr/share/keyrings/
echo "deb [arch=amd64 signed-by=/usr/share/keyrings/microsoft.gpg] https://packages.microsoft.com/repos/vscode stable main" | sudo tee /etc/apt/sources.list.d/vscode.list
sudo apt update -y
sudo apt install -y code

# Instalar IntelliJ IDEA (versión Community)
echo "Instalando IntelliJ IDEA..."
sudo snap install intellij-idea-community --classic

# Instalar CLion
echo "Instalando CLion..."
sudo snap install clion --classic

# Instalar PyCharm (versión Community)
echo "Instalando PyCharm..."
sudo snap install pycharm-community --classic

# Instalar Vim
echo "Instalando Vim..."
sudo apt install -y vim

# Instalar Geany
echo "Instalando Geany..."
sudo apt install -y geany

# Instalar Python 3
echo "Instalando Python 3..."
sudo apt install -y python3 python3-pip

# Instalar C++ (compilador GCC)
echo "Instalando GCC (C++ 17 y 20)..."
sudo apt install -y build-essential g++-10

# Instalar Kotlin Compiler (kotlinc)
echo "Instalando Kotlin Compiler..."
sudo snap install --classic kotlin

# Instalar OpenJDK 18
echo "Instalando OpenJDK 18..."
curl -s "https://get.sdkman.io" | bash
source "$HOME/.sdkman/bin/sdkman-init.sh"
sdk install java 18-open



# Verificar instalación de programas
echo "Verificando las instalaciones..."
code --version
idea --version
clion --version
pycharm --version
vim --version
geany --version
python3 --version
g++ --version
kotlinc -version
java -version

echo "Instalación completada."
