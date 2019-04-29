## Apache Camel example

Routes:
- `FileTransferRouter`
    copies file from `C:\camel-test\inbox` to `C:\camel-test\outbox`
- `TwoServiceCallRouter` makes calls to two services and returns response (http://localhost:8080/api/getDemoResponse).
- `RestClientRouter` calls https://www.passwordrandom.com/query?command=password and return generate password (http://localhost:8080/api/getPassword)