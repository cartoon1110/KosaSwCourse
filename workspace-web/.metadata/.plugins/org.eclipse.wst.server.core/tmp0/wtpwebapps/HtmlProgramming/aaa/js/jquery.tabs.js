/*
	옵션
	start_index: 시작 인덱스 설정,
	random: 랜덤 인덱스 설정,
	transition_time: 장면 전환 시간 설정 (밀리초, 1/1000초)
 */
$(function() {
	$.fn.tabs = function(options) {		
		// 옵션 설정.
		options = $.extend({
			start_index: 1,
			random: false,
			transitions_time: 400
		}, options);
		
		// jQuery 체인.
		return this.each(function() {			
			// 대상 참조.
			var $this = $(this);
			var $menu = $this.find('.tab_menu');
			var $menu_li = $menu.find('li');
			var $menu_a = $menu_li.find('a');
			var $contents = $this.find('.tab_contents');			
			
			// 랜덤 인덱스 설정.	
			if(options.random) {
				options.start_index = Math.floor(Math.random() * $menu_li.length + 1);
			}
			
			// 플러그인 대상 객체에 클래스 부여	
			$this.addClass('tabs');
			
			// 처음 보여질 탭 설정.
			$menu.add($contents)	.find('li:nth-child(' + options.start_index + ')').addClass('active');
							
			// $menu 내부의 a 클릭 시 이벤트 핸들링
			$menu_a.click(function(e) {			
				// 대상 참조.
				var $this = $(this);
				var target = $this.attr('href');
					
				// 활성화된 a 클릭 시, 작동하지 않도록 설정.
	 			if($this.parent().hasClass('active')) return;
	 			
	 			// $menu_link에서 active 클래스 제거
				$menu_li.removeClass('active');
				
				// 클릭한 a의 부모 li에 active 클래스 추가
				$this.parent().addClass('active');
				
				// 부드러운 장면전환.
				$contents.find('li').fadeTo(options.transition_time, 0, function() {
					$(this).removeClass('active').filter(target).addClass('active').fadeTo(options.transition_time, 1);
				});
			
				// 브라우저 링크 기본 동작 차단
				e.preventDefault();				
			});
			
		});
	};
});










