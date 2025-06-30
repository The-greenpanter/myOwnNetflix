# 🎬 MVP Streaming Platform – Netflix-like Architecture

Este es un proyecto MVP (Minimum Viable Product) de una plataforma de streaming, basado en una arquitectura moderna distribuida. El sistema incluye autenticación, gestión de contenido y un frontend separado, todo orquestado con Docker y preparado para CI/CD.

---

## 🧱 Arquitectura

- **API Gateway** – Spring Boot
- **Auth Service** – Spring Boot + PostgreSQL
- **Content Service** – Go + Cassandra
- **Frontend** – React + TypeScript
- **Broker opcional** – Apache Kafka
- **Orquestación** – Docker Compose
- **CI/CD** – GitHub Actions (en desarrollo)
- **Despliegue futuro** – Fly.io / Render / Railway

---

## 🛠️ Tecnologías

| Capa             | Tecnología             |
|------------------|------------------------|
| Backend principal| Spring Boot 3.2 (Java 21) |
| Microservicio    | Go 1.21+               |
| Frontend         | React + Vite           |
| Base de datos    | PostgreSQL + Cassandra |
| Seguridad        | JWT (Spring Security)  |
| Contenedores     | Docker                 |
| Mensajería       | Kafka (opcional)       |

---

## 🚀 Cómo correr localmente

1. Clonar el repositorio:

```bash
git clone https://github.com/tuusuario/mvp-streaming-app.git
cd mvp-streaming-app
