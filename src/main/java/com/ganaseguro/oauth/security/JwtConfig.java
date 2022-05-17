package com.ganaseguro.oauth.security;

public class JwtConfig {
    public static final String LLAVE_SECRETA="alguna.clave.secreta.12345678";

    public static final String RSA_PRIVATE="-----BEGIN RSA PRIVATE KEY-----\r\n" +
            "MIIEpAIBAAKCAQEAvJUM7Bvz5hLsQ2hwrmCptqB9CjAwoEN8bywZhCSZtigOU/yi\r\n" +
            "0iE9o3Tnxr6M6WVK8XZcP5HdJq58Gyh327xJ+1Zc49o3KczH9iSu3gTSTNm0zbaR\r\n" +
            "LrkK7a59TLreyNJhS5kDp744p9y9nnwgxfcXr5Y75omQsI3Q8D6igsp1p94sMwN5\r\n" +
            "o8lx2SNvdZHd/urBsNPI1GzmlEqtLWMHJ+xI46Ol6Ri7jrs440tSxZ3KHbhgm9Lp\r\n" +
            "Y4ncxysU7q2M6PJVFZO8QpmJyQ+XJwgmOPzxQl0HbL0wHMDyeChzX5rcAQ8i+PLX\r\n" +
            "gc6FrTB5grSaJyRwZmTPVUpEy+D7sLUbdl/r0wIDAQABAoIBAQCyWBeXd7wKexzb\r\n" +
            "hvsBvsLhxxdZukdSWWBl1wPul5qSzYD3ZrYpGWysmBPWPkEPPU9J2hDVwcGvIlaW\r\n" +
            "bIgl1AT3YC6LAcUnj9YP75M8vryQF1fJMH5O/IrcSyeOmC+3JlcDYps1WU1FWxos\r\n" +
            "tuFbtxm8Yc0WckTW49eUTPftz0DD1lX/yBppZialBiZ3Sl8N/enOqE8xVNZbAhvS\r\n" +
            "FAp6Bk0tC8S4tzVQPV1tF9mfKvd+twH5DQhJj/743/vhT48nPl+l+D0wRL5JF5ME\r\n" +
            "d2Oi6lF4LDsLHPaGU/oCCL3UgpThnPpXDzfdC1FDTbeeaD8YvC7wDvKNotdlZQeB\r\n" +
            "aAuXGYQhAoGBAOmsv+KRD9gBbjzUpDdFyOniKv1Pfo+G3yGBFxjgPBGvUSLXnrEC\r\n" +
            "wLkWOVQpTRZu1QIgH9Q3LZ9DLw/UTFYnha0u9q1gQ2TBYC2PwcUsglOplE1lP113\r\n" +
            "05sL4Q+DktB6spWk/UzcVZtD9rvDJcWCs4fjuZjp3eMIAGuvbe4Mj6ExAoGBAM6Z\r\n" +
            "a6ic7lisBFbEoNk9sLUKADMduDygZkraeKUAdLH/HUR+jr0Zb0nePUY/rO1z4xKu\r\n" +
            "aKjBWRHuiZES6gt+hpqKpmE/OM/qNxSFOBh77B04kjETO/ob/BcCQ52MVlG3crqB\r\n" +
            "p+swo2Ed+BvllU8nt6bIKN7C3foVA31nY2aQxXxDAoGBAJn02lwBLUoo7yOfCi7s\r\n" +
            "iIooHCDXPlB8EQj3D2uxWYJhWvi0zXZclPOdQ9pCd+q+zRLgbXgZfrJ+xkQMoNrm\r\n" +
            "oTlQRvBGC0EX8zExlP4+7AMJKI+xlIUVjNKLihX5n0JChOT5VnZMeQ6aQbbFxV4T\r\n" +
            "VgvDKyYnd6y8OeK5K5l6pysRAoGAEMe/ScutREB8fbuswNhU4O92ArDYRPxWMqA6\r\n" +
            "ClTWJZrt+qE44L0PH/XQDkOfvQ2blOnbkFFb9avlOoZJwjM9pZG7X8ytxZ1laeJE\r\n" +
            "IyD1lY4BucCxL2hUel3xtfsvC6YVyHY9eEnUC1BO1Z05GlvEe+RoBWfYdbZ9ORNL\r\n" +
            "rIn3sFcCgYBrgobPHGzVvmAwAMp+LyN1vNdTdAfKUss1noX2YjjhCtuECZEgIvkk\r\n" +
            "Y0Y6a6vUJMXxkjiPp4v/Gdl8QKlKtVBrVuIo1h2n8aYfGe2CsysDN25xQgBpCnbW\r\n" +
            "apDlCBGrYFctyqtdGcOdo3QGhabWPSMpeiIOu1NaAjuYDWcYWRQuAA==\r\n" +
            "-----END RSA PRIVATE KEY-----";

    public static final String RSA_PUBLIC="-----BEGIN PUBLIC KEY-----\r\n" +
            "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAvJUM7Bvz5hLsQ2hwrmCp\r\n" +
            "tqB9CjAwoEN8bywZhCSZtigOU/yi0iE9o3Tnxr6M6WVK8XZcP5HdJq58Gyh327xJ\r\n" +
            "+1Zc49o3KczH9iSu3gTSTNm0zbaRLrkK7a59TLreyNJhS5kDp744p9y9nnwgxfcX\r\n" +
            "r5Y75omQsI3Q8D6igsp1p94sMwN5o8lx2SNvdZHd/urBsNPI1GzmlEqtLWMHJ+xI\r\n" +
            "46Ol6Ri7jrs440tSxZ3KHbhgm9LpY4ncxysU7q2M6PJVFZO8QpmJyQ+XJwgmOPzx\r\n" +
            "Ql0HbL0wHMDyeChzX5rcAQ8i+PLXgc6FrTB5grSaJyRwZmTPVUpEy+D7sLUbdl/r\r\n" +
            "0wIDAQAB\r\n" +
            "-----END PUBLIC KEY-----";
}
