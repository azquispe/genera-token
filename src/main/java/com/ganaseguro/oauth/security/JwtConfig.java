package com.ganaseguro.oauth.security;

public class JwtConfig {

    public static final String RSA_PRIVATE="-----BEGIN RSA PRIVATE KEY-----\n" +
            "MIIEowIBAAKCAQEAvTi3g7xOXzoq6p5fMbHwSLu4ja3qYo9RN/wd6LKcKpnzbq3+\n" +
            "WBR20rsq/Y6Bq6wG+4cHtw5AfmsJp6xnWPdb72qJXFvaOoQw5z1e2mVDe9eko2Ql\n" +
            "CF+i/nD1cT4VsiBT7pjvc/bpjYPH26F9Mvsa15+i2uJxMksvl4ULm1xS0GpE6bgE\n" +
            "pR/7B2VpQqaUgrjfZIBzfGC8l4HFCJvpx9SK8IEpN0Wfm5cuwYom68O9bUtZl6u0\n" +
            "7RDBrJEuJacctFVHI6dV0QRBHReWVJyrOsmjW/Y9halE+f1kgzA7ijLusHx8YveF\n" +
            "2KH7a3eTquwl5uWGp+FGSoQk8257hdypTiArIQIDAQABAoIBAHlnKlcbOi1e5Koj\n" +
            "cnAv+jqwNniwXPFfgnypBYeHEStEGyun9sgMWTBbZfnItOmwNcqrmAea3UY+5rLt\n" +
            "qmEqU5IIiJj5Vcq1harXdUQqNGIAuWEbn6b/tVQKpW9CpijjFPbAqOF+SdrB8ji4\n" +
            "I9vRwCcYBSTqpDXgh2hvtEK5uWh9q3kUBs+1Ejd/O2h9ioQnLlNK7mFlvypIxKw0\n" +
            "/KHjoenDh0YUdWsUaEaHtx3Nr4IrZKJG6zXmW23HG3EVL7R8zwYqpc4Pb61fSI/l\n" +
            "1fqQ9Y+d0+wkDGZipRpM/DNE3gp+dS6RuQnX0M7rSIpzEfC0Ek6s2DX7ztNvN/GG\n" +
            "iaCuIQECgYEA5vLGbNfiK6d7ZvgQZFGIKTwcEDgrj/GcwI7dM3Xwd1KZby/55ygQ\n" +
            "XQivNTaI3nyn4pv+q9ifGeHDz6SjPPmSRNr/HhIgL16leN3uu8Lfuk3H1AjVjghC\n" +
            "Ft47MryNI8/ZeOsocgUAWKcPZvClkLuaPjoq7TaP4OqpuJ2/CNrg2D8CgYEA0b86\n" +
            "EYtqactZ6w9nHqXIXiFrZCpeR2+vWXyC2NwFLHkM1aKY5gsKZy8EQuqVMEfBnwio\n" +
            "qs3PdKAev/bIcpGT1wO6Q3rEhX1Ie9x8OCK7o3/XTcMDTB3dhcXFv+/uKXgJflLA\n" +
            "B5RnziwT3hSzgwcFIKrkesP0PInBL2tv31WvJJ8CgYEAqEvWiU6wxHsiFCFFYLWB\n" +
            "cfsZwEAOjrDVOAVj8LJLb8jDgyEFDYxGkGVZuH9rMibI+PwQlA4hsuywkso5IqAE\n" +
            "FSU5sCIpThu8nd2ssSsLempf6oYdiYk/EAcWQJzihWxb4CANszktzWzAbpWDMXtk\n" +
            "pWAiFAckxhR7ZcuegMdv/mUCgYBsfDTjqDFlANnEO5ZBgsvM7Aoop8VVu419gmoH\n" +
            "El3Wr9GUmeHtch5yWh4hIkYBz8t0nzzmA0de8gaVkWYB5AwMdRAdIN2OkcswzUyu\n" +
            "mEBnA5Nv1ALblsLiEvYCHW4Yos5+OPy7ruW1/JRWFGz4w2PCjsFYQgwMV8/E4BPf\n" +
            "9uh8zwKBgHNeApXbJ26lxkT3ZY0GGe9/nJHc6jWxar6IK+903LfnEO+ANDQw6fMq\n" +
            "G0WeNncD37RMrEVUrtqA0zFrGX/Y6N7QBZgIYNBjrIfoQ3LF7NRfCyAqPIPIaLVN\n" +
            "AsBrTKG8224L+cfyYbOjRcQqZ2GmL4ABb+JYG3fICiMnV6ikOkQE\n" +
            "-----END RSA PRIVATE KEY-----";

    /*public static final String RSA_PUBLIC="-----BEGIN PUBLIC KEY-----\n" +
            "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAvTi3g7xOXzoq6p5fMbHw\n" +
            "SLu4ja3qYo9RN/wd6LKcKpnzbq3+WBR20rsq/Y6Bq6wG+4cHtw5AfmsJp6xnWPdb\n" +
            "72qJXFvaOoQw5z1e2mVDe9eko2QlCF+i/nD1cT4VsiBT7pjvc/bpjYPH26F9Mvsa\n" +
            "15+i2uJxMksvl4ULm1xS0GpE6bgEpR/7B2VpQqaUgrjfZIBzfGC8l4HFCJvpx9SK\n" +
            "8IEpN0Wfm5cuwYom68O9bUtZl6u07RDBrJEuJacctFVHI6dV0QRBHReWVJyrOsmj\n" +
            "W/Y9halE+f1kgzA7ijLusHx8YveF2KH7a3eTquwl5uWGp+FGSoQk8257hdypTiAr\n" +
            "IQIDAQAB\n" +
            "-----END PUBLIC KEY-----";*/

}
