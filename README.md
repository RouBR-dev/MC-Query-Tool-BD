## 🎮 MC Query Tool BD

O **MC Query Tool BD** é um aplicativo Android desenvolvido para **consultar servidores Minecraft Bedrock** de forma rápida, simples e eficiente. Ele permite verificar o **status do servidor em tempo real**, exibindo informações essenciais para jogadores e administradores, com histórico de consultas e recursos avançados de interação.

---

### 🚀 Funcionalidades

* 🟢🔴 **Status do servidor** (Online / Offline)
* 🌐 **IP e porta** do servidor consultado
* 🎮 **Tipo do servidor**: Bedrock
* 🧩 **Versão do servidor**
* 👥 **Jogadores online / máximo**
* ⏱ **Ping do servidor** (quando disponível)
* 📜 **MOTD do servidor**
* 🕹 **Modo de jogo** (gamemode)
* 📡 **Protocolo do servidor**
* 🕒 **Data e hora da última consulta**
* 📡 **Verificação automática de conexão com a internet**
* 💾 **Salvamento automático** do último IP, porta e resultado da consulta
* ⏳ Mensagem inicial indicando **“Aguardando a primeira consulta…”**
* 📚 **Histórico de consultas** com visualização colorida e invertida
* ⚡ **Histórico de IPs e portas** clicável, que preenche os campos de consulta rapidamente
* 📤 **Compartilhamento de resultados** via qualquer aplicativo de texto
* 🎨 Interface moderna com cores, emojis e efeitos de clique nos botões e campos

---

### ⚙️ Como funciona

1. Insira o **IP** e a **porta** do servidor Bedrock (porta padrão: 19132)
2. Toque em **Consultar**
3. O app faz a consulta usando a API pública **mcsrvstat.us**
4. As informações são exibidas de forma **colorida e organizada**
5. O **último resultado é salvo** e restaurado ao reabrir o app
6. Consulte o **histórico completo de consultas** ou de **IP e portas salvos**
7. Compartilhe resultados rapidamente com **um toque**

---

### 🧠 Diferenciais

* Interface simples e direta, com cores e emojis para destacar informações
* Consulta feita sempre **do zero**, garantindo dados atualizados
* Histórico avançado de consultas e IPs/Portas, clicável para preenchimento rápido
* Compartilhamento fácil de resultados para qualquer app de texto
* Ideal para **administradores**, **donos de servidores** e **jogadores**

---

### 📱 Tecnologias utilizadas

* Java (Android)
* SharedPreferences (armazenamento de IP, porta e histórico)
* RequestNetwork (requisições HTTP à API)
* JSON Parsing (processamento de respostas da API)
* Android Views: TextView, EditText, Button
* Efeitos visuais: GradientDrawable, LayerDrawable e animações de clique

---

### 🛠️ Objetivo do projeto

Facilitar a consulta e o monitoramento de servidores **Minecraft Bedrock**, oferecendo informações claras, rápidas e confiáveis em um aplicativo leve, moderno e fácil de usar, com histórico completo e compartilhamento simplificado.

---

### 🆓 Open Source

O **MC Query Tool BD** é totalmente **open source**, permitindo que qualquer pessoa **estude, modifique e contribua** com melhorias para o projeto.

