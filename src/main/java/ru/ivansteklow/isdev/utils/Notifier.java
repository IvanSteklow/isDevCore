/*
 * Copyright 2017 (c) IvanSteklow
 * Licensed under the Apache License, Version 2.0
 */
package ru.ivansteklow.isdev.utils;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * It's old version of debugger. <b>I DON'T RECOMMEND USE THIS CLASS and it
 * doesn't have any documentation</b>
 * 
 * @author IvanSteklow
 *
 */
public class Notifier {

	private static final Logger LOG = LogManager.getLogger("IvanSteklow's Mods");

	public static void custom(String msg, String modname, Level level) {
		msg = "[" + modname + "] " + msg;
		LOG.log(level, msg);
	}

	public static void info(String msg, String modname) {
		msg = "[" + modname + "] " + msg;
		LOG.log(Level.INFO, msg);
	}

	public static void error(String msg, String modname) {
		msg = "[" + modname + "] " + msg;
		LOG.log(Level.ERROR, msg);
	}

	public static void warn(String msg, String modname) {
		msg = "[" + modname + "] " + msg;
		LOG.log(Level.WARN, msg);
	}

	public static void debug(String msg, String modname) {
		msg = "[" + modname + "] " + msg;
		LOG.log(Level.DEBUG, msg);
	}
}
