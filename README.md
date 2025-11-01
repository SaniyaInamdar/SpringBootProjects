# SmartBazaar - Backend (Spring Boot)

This is a complete working backend skeleton for the SmartBazaar project (E-Commerce + Wallet).

### Run
- Import into your IDE (IntelliJ/Eclipse) as a Maven project.
- Run `SmartBazaarApplication` main class.
- H2 console: http://localhost:8080/h2-console (JDBC URL: jdbc:h2:mem:smartbazaar)

### Endpoints (examples)
- GET  /api/products
- POST /api/products
- GET  /api/products/{id}
- PUT  /api/products/{id}
- DELETE /api/products/{id}
- GET  /api/products/category/{cat}
- GET  /api/users
- POST /api/users/register
- GET  /api/wallets/{id}
- POST /api/wallets/{id}/topup?amount=100
- POST /api/wallets/transfer?from=1&to=2&amount=50

H2 is used for simplicity so you can run locally without MySQL setup.
