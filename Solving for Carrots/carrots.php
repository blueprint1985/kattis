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

	$contestants = $inputArr[0];
	$carrots = $inputArr[1];

	for ($i = 0; $i < $contestants; $i++) {
		$nextContestant = stream_get_line(STDIN, 1024, PHP_EOL);
	}

	fwrite(STDOUT, $inputArr[1]);

?>