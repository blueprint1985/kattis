<?php
	/**
	 * Ladder by Martin Björling, 
	 * martinbjorling@gmail.com, 0737565044
	 *
	 * @author   Martin Björling
	 * @version  1.0
	 * @since    2015-11-04
	 */

	$inputString = stream_get_line(STDIN, 1024, PHP_EOL);

	$inputArr = explode(" ", $inputString);

	$wallHeight = $inputArr[0];
	$laddAngle = deg2rad($inputArr[1]);

	$laddLength = $wallHeight / sin($laddAngle);

	$answer = ceil($laddLength );

	fwrite(STDOUT, $answer);

?>