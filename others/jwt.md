# JWT

JWT stands for JSON Web Token. It is an open standard that defines a compact and self-contained way of transmitting information between parties as a JSON object. JWT is often used to authenticate users and validate their access to certain resources.

**A JWT typically consists of three parts: a header, a payload, and a signature.**

The header typically consists of two parts: the **type of the token**, which is JWT, and the **signing algorithm** being used, such as HMAC SHA256 or RSA.

The payload contains the claims. Claims are statements about an entity (typically, the user) and additional metadata. There are three types of claims: registered, public, and private claims. Registered claims are a set of predefined claims which are not mandatory but recommended, to provide a set of useful, interoperable claims. Public claims are claims that are defined by parties other than the JWT issuer, while private claims are claims that are specific to the application.

The signature is used to verify that the sender of the JWT is who it says it is and to ensure that the message wasn't changed along the way. The signature is created using a secret key, which is known only to the issuer and the recipient of the token.

JWT is often used to authenticate users and validate their access to certain resources. JWT can be used to transmit information that is too sensitive to send in the clear, such as an access token, or to send information that can be verified and trusted, such as the identity of an authenticated user.

JWT is a stateless authentication mechanism, as the user state is never saved in server memory. So the server's protected routes will check for a valid JWT in the Authorization header, and if it's present, the user will be allowed to access protected resources. If the JWT is invalid, the server will return a 403 Forbidden response.


**JWT can be verified at the backend by following these steps:**

1. Extract the JWT from the Authorization header of the incoming request. The JWT is typically sent in the Authorization header as a Bearer token.

2. Verify the signature of the JWT. The signature is used to ensure that the sender of the JWT is who it says it is and that the message was not modified in transit. The signature is verified by using the secret key that was used to sign the JWT.

3. Validate the claims of the JWT. Claims are statements about an entity (typically, the user) and additional metadata. The claims should be checked to ensure that the token is valid and that the user is authorized to access the requested resource.

4. Check the expiration time (exp claim) of the token. If the token has expired, the server should return a 401 Unauthorized response.

5. If the JWT is valid and the signature is verified, the server should proceed to process the request and return the appropriate response.