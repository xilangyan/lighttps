package com.github.yantzu.lighttps.filter;

import java.io.InputStream;
import java.security.PrivateKey;

public interface PrivateKeyParser {
	public PrivateKey parse(InputStream inputStream);
}
