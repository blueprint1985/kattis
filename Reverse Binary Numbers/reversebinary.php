<?php
	/**
	 * Reversed Binary Numbers by Martin Björling, 
	 * martinbjorling@gmail.com, 0737565044
	 *
	 * @author   Martin Björling
	 * @version  1.0
	 * @since    2015-03-25 
	 */

	$inputString = stream_get_line(STDIN, 1024, PHP_EOL);

	$bin_num = decbin($inputString);
	$bin_num_rev = strrev($bin_num);
	
	$answer = bindec($bin_num_rev);

	fwrite(STDOUT, $answer);
	

?>
