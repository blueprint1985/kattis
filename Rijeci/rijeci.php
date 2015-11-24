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

	$a = 1;
	$b = 0;

	for ($i=0; $i < $inputString; $i++) { 
		$aOld = $a;
		$a = $b;
		$b = $aOld + $b;
	}

	$answer = $a . " " . $b;

	fwrite(STDOUT, $answer);

?>